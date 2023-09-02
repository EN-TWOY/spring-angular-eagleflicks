import { Component, OnInit } from '@angular/core';
import { Director } from '../director';
import { ActivatedRoute } from '@angular/router';
import { DirectorService } from '../director.service';

@Component({
  selector: 'app-detalle-director',
  templateUrl: './detalle-director.component.html',
  styleUrls: ['./detalle-director.component.css']
})
export class DetalleDirectorComponent implements OnInit  {

  id:number;
  objDirector:Director;

  constructor(private route:ActivatedRoute, private directorService:DirectorService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.objDirector = new Director();
    this.directorService.obtenerDirectorPorId(this.id).subscribe(dato => {
      this.objDirector = dato;
    });
  }
}