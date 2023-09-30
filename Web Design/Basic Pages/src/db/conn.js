const mongoose = require("mongoose")

mongoose.connect("mongodb://localhost:22017/paymentDetails",{
    useNewUrlParser:true,
    useUnifiedTopology:true,
    useCreateIndex:true
}).then(()=>{
    console.log(`Connection Successful`)
}).catch((e) =>{
    console.log(`no Connection`)
})

