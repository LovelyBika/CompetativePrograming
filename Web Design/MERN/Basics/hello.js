const http =require('http')
var dt= require('./myModule') 
var fs = require('fs')

const hostname ='127.0.0.1'
const port =3000

const server =http.createServer((req,res)=>{
   fs.readFile('index.html',function(err,data){
    res.statusCode=200;
    res.setHeader('Content-type','text/plain');
    res.write("The current Date and time"+dt.myDateTime());
    res.write(data);
    res.end("its working bro");
   })
    
});

server.listen(port,hostname,()=>
{
    console.log('server running at http://$(hostname):$(port)/');
});