import mongoose from "mongoose";

const orderItemSChema = new mongoose.Schema({
    productId:{
        type:mongoose.Schema.Types.ObjectId,
        ref:"Product"
    },
    quantity:{
        type:Number,
        required:true
    }
})


const orderSchema = new mongoose.Schema({
    orderPrice:{
        type:Number,
        required:true,

    },
    customer:{
        type:mongoose.Schema.Types.ObjectId,
        ref:"User"
    },
    orderItems:{
        type:[orderItemSChema]
    },
    adress:{
        type:String,
        required:true
    },
    satus:{
        type:String,
        enum:["PEMDING","CANCELLED","DELIVERED"],
        default:"PENDING"
    }
},{timestamps:true})

export const Order = mongoose.model("Order",orderSchema)