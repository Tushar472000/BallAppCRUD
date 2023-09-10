import { Component } from '@angular/core';
import { Ball } from './Ball';
import { HttpClient } from '@angular/common/http';
import { getBall } from './getBall';

@Component({
  selector: 'app-show-ball',
  templateUrl: './show-ball.component.html',
  styleUrls: ['./show-ball.component.css']
})
export class ShowBallComponent {

  constructor(private http:HttpClient)
  {

  }
  
   obj:Ball=new Ball();
   Data;
   arr:getBall[]=[];
   showtabledata=0;
   
   submit()
   {
    this.http.post('http://localhost:8080/addBall',this.obj).subscribe(
      
    )
    this.showtabledata=0;
   }
   

   show()
   {
    this.http.get('http://localhost:8080/getData').subscribe(
      (get:any)=>{
       this.Data=get;
       for(let i=0;i<get.length;i++)
       {
        console.log(get[i]);
        this.arr[i]=get[i];
       }
      }
    )
   }
   
   
   showtable(number:any)
   {
       this.showtabledata=number
      
   }
   
}
;