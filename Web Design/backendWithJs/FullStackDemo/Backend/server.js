import 'dotenv/config'
import express from 'express'
const app =express()
const PORT = process.env.PORT || 4321
app.get('/api/jokes',(req,res)=>{
  
    const jokes =[
        {
          id: 1,
          title:'First Joke',
          content:"This is Firt Joke"
    
        },
        {
          id: 2,
          title:'Second Joke',
          content:"This is  Second Joke"
    
        },
        {
          id: 3,
          title:'Third Joke',
          content:"This is Third Joke"
    
        },
        {
          id: 4,
          title:'Fouth Joke',
          content:"This is Fourth Joke"
    
        },
        {
          id: 5,
          title:'Fiveth Joke',
          content:"This is Fiveth Joke"
    
        },
    ];
    res.send(jokes)
})

app.use(express.static('dist')); //middleware or badPractice useCase in big Tech company to reduce the cost of devops ci/cd 
app.get('/',(req,res)=>{
    res.send("I am Server")
})

app.get('/Lovely',(req,res)=>{
    res.send("Lovely Route")
})

app.listen(PORT,()=>{
    console.log(`Server is running at Port:${PORT}`);
})

