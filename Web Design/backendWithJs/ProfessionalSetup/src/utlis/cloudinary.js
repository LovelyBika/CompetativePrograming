import {v2 as cloudinary} from 'cloudinary'
import fs from 'fs'

          
cloudinary.config({ 
  cloud_name: process.env.CLOUDINARY_CLOUD_NAME, 
  api_key: process.env.CLOUDINARY_API_KEY, 
  api_secret: process.env.CLOUDINARY_API_SECRET 
});

const uploadOnCloudinary = async (localFileStorage)=>{
    try{
        if(!localFileStorage) return null
        //Upload the file on Cloudinary
        const response = await cloudinary.uploader.upload
        (localFileStorage,{
            resource_type:'auto'
        })
        console.log("File is Uploaded on CLoudinary",
        response.url)
        return response
    }
    catch(error){
        fs.unlinkSync(localFileStorage) /*remove the locally saved temporay file as the 
        upload operation got failed */

        return null
    }
}
export {uploadOnCloudinary}