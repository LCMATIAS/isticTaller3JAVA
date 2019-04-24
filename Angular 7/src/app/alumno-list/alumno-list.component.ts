import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';
import { Alumno } from '../models/alumno.model';

@Component({
  selector: 'app-alumno-list',
  templateUrl: './alumno-list.component.html',
  styleUrls: ['./alumno-list.component.scss']
})
export class AlumnoListComponent implements OnInit {

  constructor() { }

  @Input() alumnos: Alumno[];
  alumnoSeleccionado: Alumno = null;
  @Output() seleccionar = new EventEmitter<Alumno>();

  ngOnInit() {
  }

  seleccionarAlumno(alumno: Alumno) {
    this.alumnoSeleccionado = alumno;
    this.seleccionar.emit(alumno);
  }
}
