export class ListItem {
  constructor(
    public id: number,
    public descripcion: string
  ) {}
}


export class GenericList {
  public list: ListItem[];

  public get(id: number) {
    return this.list.find(item => item.id === id);
  }
}

export class PerfilList extends GenericList  {
  constructor() {
    super();
    this.list = [
      new ListItem( 0, 'Desarrollador'),
      new ListItem( 1, 'IT'),
      new ListItem( 2, 'Power User'),
      new ListItem( 3, 'DevOp'),
    ];
  }
}

export class SexoList extends GenericList  {
  constructor() {
    super();
    this.list = [
      new ListItem( 0, 'Femenino'),
      new ListItem( 1, 'Masculino'),
      new ListItem( 2, 'Otro')
    ];
  }
}

