import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppMenuComponent } from './app-menu/app-menu.component';
import { LayoutModule } from '@angular/cdk/layout';
import { MatToolbarModule, MatButtonModule, MatSidenavModule, MatIconModule,
         MatListModule, MatFormFieldModule, MatCardModule, MatInputModule
       } from '@angular/material';
import { AlumnoItemComponent } from './alumno-item/alumno-item.component';
import { AlumnoManagerComponent } from './alumno-manager/alumno-manager.component';
import { AlumnoListComponent } from './alumno-list/alumno-list.component';
import { FilterBoxComponent } from './filter-box/filter-box.component';
import { AlumnoEditComponent } from './alumno-edit/alumno-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    AppMenuComponent,
    AlumnoItemComponent,
    AlumnoManagerComponent,
    AlumnoListComponent,
    FilterBoxComponent,
    AlumnoEditComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    LayoutModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    MatFormFieldModule,
    MatCardModule,
    MatInputModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
