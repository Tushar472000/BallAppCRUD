import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'MyTest';
  showComponent=0;
  showBall(number:any)
  {
      this.showComponent=number;
  }
}
