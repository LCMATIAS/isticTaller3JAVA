import { Component, OnInit, Input } from '@angular/core';
import { Alumno } from '../models/alumno.model';
import { ListItem, SexoList, PerfilList } from '../models/list-item.model';

@Component({
  selector: 'app-alumno-edit',
  templateUrl: './alumno-edit.component.html',
  styleUrls: ['./alumno-edit.component.scss']
})
export class AlumnoEditComponent implements OnInit {

  @Input() alumno: Alumno;

  sexos: ListItem[];
  perfiles: ListItem[];
  sexosList: SexoList;
  perfilesList: PerfilList;

  constructor() { }

  ngOnInit() {
    this.sexosList = new SexoList();
    this.perfilesList = new PerfilList();

    this.sexos = this.sexosList.list;
    this.perfiles = this.perfilesList.list;
  }

  guardar(form: object, valid: boolean) {
    console.log(form);
  }
}
