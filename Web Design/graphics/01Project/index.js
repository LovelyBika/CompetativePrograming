document.addEventListener("DOMContentLoaded",()=>{
    var canvas = document.getElementById('myCanvas')
    var xPos=0;
    var yPos=0;
    if(canvas.getContext){
        var ctx = canvas.getContext("2d");
        //Drawing Code 
       
       function draw(){
        ctx.fillStyle="black"
        ctx.fillRect(0,0,canvas.width,canvas.height);

        ctx.fillStyle="green"
        ctx.fillRect(100,yPos,100,100)

        ctx.strokeStyle="red";
        ctx.lineWidth=5;
        ctx.strokeRect(100,300,100,100);

        xPos+=1
        yPos+=1
         if(yPos<=300)
        {requestAnimationFrame(draw)
        }
    //    ctx.beginPath();
    //     ctx.arc(400, 100, 50, 0, 2 * Math.PI);
    //     ctx.fillStyle = "yellow";
    //     ctx.fill();
    //     ctx.lineWidth = 3;
    //     ctx.strokeStyle = "orange";
    //     ctx.stroke();
       }

       draw()
    }
});

