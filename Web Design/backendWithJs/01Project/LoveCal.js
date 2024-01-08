// import Accountid  from "./api.js";
// import {password,Gender} from "./api.js"
// console.log(Accountid)
// console.log(Gender)
// console.log(password)

import http from "http";
import  {LoveCalCulate}  from "./api.js"



const server=http.createServer((req,res)=>{
 if(req.url==="/"){
    res.end(`<h1>Love is ${LoveCalCulate()}</h1>`)
 }
 else if(req.url==="/about"){
    res.end("<h1>about</h1>")
 }
 else if(req.url==="/Contacts"){
    res.end("<h1>Contacts</h1>")
 }
 else{
    res.end("<h1>Page is Not Found</h1>")
 }
})

server.listen(3000,()=>{
    console.log("server is working")
})