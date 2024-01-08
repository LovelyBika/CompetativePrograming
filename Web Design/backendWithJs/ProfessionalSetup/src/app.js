import express from 'express'
import cors from 'cors'
import cookieParser from 'cookie-parser'
const app = express()
// MiddleWare BY use function of Express 
app.use(cors({
    origin:process.env.CORS_ORIGIN,
    credentials:true
}))
app.use(express.json({limit:"16kb"}))

app.use(express.urlencoded({extended:true},
    {limit:"16kb"}))
app.use(express.static("public"))
app.use(cookieParser())


//routes 
import userRouter from './routes/user.routes.js'

//routes declartion
app.use("/api/v1/users",userRouter)

 

export {app}