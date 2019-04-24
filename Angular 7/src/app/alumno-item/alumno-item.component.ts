import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

import { Alumno} from '../models/alumno.model';

@Component({
  selector: 'app-alumno-item',
  templateUrl: './alumno-item.component.html',
  styleUrls: ['./alumno-item.component.scss']
})
export class AlumnoItemComponent implements OnInit {

  @Input() alumno: Alumno;
  @Input() seleccionado = false;
  @Output() seleccionar = new EventEmitter<Alumno>();

  constructor() { }

  ngOnInit() {
  }

  flipSeleccion() {
    this.seleccionar.emit(this.alumno);
  }
}
