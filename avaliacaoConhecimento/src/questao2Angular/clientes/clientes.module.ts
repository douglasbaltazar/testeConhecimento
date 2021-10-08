import { MatCardModule } from '@angular/material/card';
import { MatTableModule } from '@angular/material/table';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ClientesComponent } from './clientes/clientes.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { ClientesRoutingModule } from './clientes-routing.module'



@NgModule({
  declarations: [
    ClientesComponent
  ],
  imports: [
    CommonModule,
    MatTableModule,
    ClientesRoutingModule,
    MatCardModule,
    MatToolbarModule
  ]
})
export class ClientesModule { }
