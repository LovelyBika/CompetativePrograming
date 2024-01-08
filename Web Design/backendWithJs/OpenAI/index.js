import OpenAI from "openai";
import axios from "axios";
const API_KEY= "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"
const API_URL ="https://api.openai.com/v1/engines/davinci/completions"

const prompt ="Tell me Joke"
const maxTokens=100

axios.post(API_URL,
    {
        prompt,
        maxTokens:maxTokens,
    },{
        headers:{
            'Content-Type':'application/json',
            'Authorization':`Bearer ${API_KEY}`,
        }
    })
    .then(res=>{
        console.log(`Genrated Text`,res.data.choices[0])
    })
    .catch(error=>{
        console.error('ERROR:',error.response ? error.response.data :error.message)
    })



