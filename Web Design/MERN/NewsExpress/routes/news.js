const express = require('express')
const router=express.Router()
const path= require('path')
const staticPath= path.join(__dirname,"../public/html/index.html")
router.get('/',(req,res)=>{
    res.sendFile(staticPath)
})


module.exports =router