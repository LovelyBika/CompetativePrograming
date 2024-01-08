import {asyncHandler} from '../utlis/asyncHandler.js'
import {ApiError} from "../utlis/ApiError.js"
import {  User  } from '../models/user.model.js'
import {uploadOnCloudinary} from "../utlis/cloudinary.js"
import { ApiResponse } from '../utlis/ApiResponse.js'
const registerUser = asyncHandler(async (req,res)=>{
/*  Mine thinking vs Hitesh Sir Thinking 
 1) Take Input the data from the User
    2) Store the Data into the Server/Local Storage
    3) Check the data is stored or not || Verify That API is working Fine or not  
    4) 
    --------------------------------
    1) get user details from frontend (done Via Help Postman)
    2) validation - not empty
    3)Check User ALready exist(Username || Email)
    4)check for images and Avatar
    5)upload them to Cloudinary, avtar
    6)Create User Object -create entry in db 
    7) remove password and refresh token field 
    8)check for user Creation
    9) return res
     */
     const {fullname,email,username,password}= req.body
    //  console.log("email",email)

    if(
        [fullname,email,username,password].some((field)=>
            field ?. trim()==="")
        
    ){
      throw new ApiError(404,"All field is required")
    }
    
    const existedUser = await User.findOne({
        $or:[{ username },{ email } ]
    }) 
    
    if(existedUser){
        throw new ApiError(409,"User with email or username is already exists")
    }
    
    const avatarLocalPath = req.files?.avatar[0]?.path;
    const coverImageLocalPath = req.files?.coverImage[0]?.path;
    // let coverImageLocalPath;
    // if (req.files && Array.isArray(req.files.coverImage) && req.files.coverImage.length > 0) {
    //     coverImageLocalPath = req.files.coverImage[0].path
    // }
    
    if(!avatarLocalPath){
        throw new ApiError(400,"Avatar file is required")
    }

    const avatar = await uploadOnCloudinary(avatarLocalPath)
    const coverImage = await uploadOnCloudinary(coverImageLocalPath)
    
    
    if(!avatar){
        throw new ApiError(400,"Avatar files is required")
    }
    const user = await User.create({
        fullname,
        avatar :avatar.url,
        coverImage:coverImage?.url || "",
        email,
        password,
        username:username.toLowerCase()
    })
    const createdUser = await User.findById(user._id).select(
        "-password -refreshToken"
    )
    if(!createdUser){
        throw new ApiError(500,"Something went wrong while registering the user")
    }

     return res.status(201).json(
        new ApiResponse(200,createdUser,"User registration Successfully")
     )
}
)
export {registerUser} 