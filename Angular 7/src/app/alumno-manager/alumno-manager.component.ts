import { Component, OnInit } from '@angular/core';
import { Alumno, AlumnosArray } from '../models/alumno.model';

@Component({
  selector: 'app-alumno-manager',
  templateUrl: './alumno-manager.component.html',
  styleUrls: ['./alumno-manager.component.scss']
})
export class AlumnoManagerComponent implements OnInit {

  alumnos: Alumno[];
  alumnosArray: AlumnosArray;
  alumnoSeleccionado: Alumno;

  constructor() { }

  ngOnInit() {
    this.alumnosArray = new AlumnosArray(); // ESTO NO DEBERÍA SER ASÏ. MALA PRÁCTICA
    this.alumnos = this.alumnosArray.getAll();
  }

  filtrarAlumnos(filtro: string) {
    this.alumnos = this.alumnosArray.filterbyNombreApellido(filtro);
  }

  seleccionarAlumno(alumno: Alumno) {
    this.alumnoSeleccionado = alumno;
  }

}
