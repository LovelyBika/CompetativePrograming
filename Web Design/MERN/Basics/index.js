
const express = require('express')
const path=require('path')
const app = express()
const port = 3000

app.get('/index', (req, res) => {
  // res.send('Hello World!')
res.sendFile(path.join(__dirname,'index.html'))
})
app.get('/ab', (req, res) => {
  res.send('Hello World!')
// res.sendFile(path.join(__dirname,'index.html'))
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})