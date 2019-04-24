import { ListItem } from './list-item.model';

export class Alumno {
  constructor(
    public id: number,
    public nombre: string,
    public apellido: string,
    public sexo: ListItem,
    public activo: boolean,
    public perfil: ListItem
  ) {}
}

const alumnoData = new Alumno(1, 'Juan', 'Perez', {id: 1, descripcion: 'hombre'}, true, {id: 1, descripcion: 'Desarrollador'});
export { alumnoData };

export class AlumnosArray {
  private alumnos: Alumno[] = [];

  constructor() {
    const mockAlumnos = [
      {id: 1, nombre: 'Juan', apellido: 'Perez', sexo: {id: 1, descripcion: 'masculino'},
              perfil: {id: 0, descripcion: 'Desarrollador'}, activo: true},
      {id: 2, nombre: 'Pedro', apellido: 'Garcia', sexo: {id: 1, descripcion: 'masculino'},
              perfil: {id: 1, descripcion: 'IT'}, activo: true},
      {id: 3, nombre: 'Ana', apellido: 'Romero', sexo: {id: 0, descripcion: 'Femenino'},
              perfil: {id: 2, descripcion: 'Power User'}, activo: true},
      {id: 4, nombre: 'Maria', apellido: 'Gutierrez', sexo: {id: 0, descripcion: 'Femenino'},
              perfil: {id: 0, descripcion: 'Desarrollador'}, activo: true},
      {id: 5, nombre: 'Esteban', apellido: 'Smith', sexo: {id: 1, descripcion: 'masculino'},
              perfil: {id: 2, descripcion: 'Power User'}, activo: true}
    ];

    this.alumnos = mockAlumnos.map(al => {
      return new Alumno(al.id, al.nombre, al.apellido, al.sexo, al.activo, al.perfil);
    });
  }

  getAll(): Alumno[] {
    return this.alumnos; // JSON.parse(JSON.stringify(this.alumnos));
  }

  filterbyNombreApellido(filtro: string): Alumno[] {
    return this.alumnos
            .filter(a => (a.nombre + ' ' + a.apellido).toLowerCase().includes(filtro.toLowerCase()));
  }

}
