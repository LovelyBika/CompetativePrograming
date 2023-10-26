/*!
* Start Bootstrap - Blog Home v5.0.9 (https://startbootstrap.com/template/blog-home)
* Copyright 2013-2023 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-blog-home/blob/master/LICENSE)
*/
// This file is intentionally blank
// Use this file to add JavaScript to your project

const express = require('express')
const app = express()
const path=require('path')

app.get('/',(req,res)=>{
    res.sendFile(path.resolve(__dirname,'../index.html'));
})

app.listen(3000, ()=>{
    console.log("Server is running on Port 3000");
})