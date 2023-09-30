
const express = require('express')
const path=require('path')
const { constrainedMemory } = require('process')
const app = new express()
const port = 3000

app.use(express.static("public"))
app.use('/',require(path.join(__dirname,'/routes/news.js')))
// console.log(staticPath)

// app.get('/',(req,res)=>{
//     res.sendFile(path.join(__dirname,"/template/index.html"))
// })



app.listen(port, () => {
  console.log(`Blog app listening on port ${port}`)
})