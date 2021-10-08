import { Cliente } from './../model/cliente';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.scss']
})
export class ClientesComponent implements OnInit {
    clientes: Cliente[] = [
      {
        _id: '1',
        name: 'Diego',
        tipo: 'NORMAL'
      },
      {
        _id: '2',
        name: 'Diogo',
        tipo: 'VIP'
      },
      {
        _id: '3',
        name: 'Douglas',
        tipo: 'NORMAL'
      },
      {
        _id: '4',
        name: 'Joaquim',
        tipo: 'VIP'
      },
      {
        _id: '5',
        name: 'Odete',
        tipo: 'VIP'
      },
    ];
    displayedColumns = ['name', 'tipo'];
  constructor() { }

  ngOnInit(): void {
  }

}
