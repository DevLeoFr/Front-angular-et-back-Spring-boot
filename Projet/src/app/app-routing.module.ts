import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [];

@NgModule({
  
  imports: [CommonModule,HttpClientModule,RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule { }
