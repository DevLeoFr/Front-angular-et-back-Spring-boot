import { Component } from '@angular/core';
import { SeviceGarageService } from './sevice-garage.service';
import { OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[SeviceGarageService]
})
export class AppComponent implements OnInit {
  title = 'Projet';
  cars !: any;
  constructor(private serviceGarage: SeviceGarageService){

  }
  ngOnInit(): void {
   console.log("on init...")
   this.serviceGarage.getCars().subscribe((datas) => {
    this.cars=datas;
   })
   
  }
}
