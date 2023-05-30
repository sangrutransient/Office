import { Score } from './../model/score';
import { Variant } from './../model/variant';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ReportService {
  private scoreUrl: string;
  private variantUrl: string;


  constructor(private http: HttpClient) {
    this.scoreUrl = 'http://localhost:8081/v2/score/card';
    this.variantUrl = 'http://localhost:8081/v2/score/variant';
   }

   public getScore(): Observable<Score[]> {
      return this.http.get<Score[]>(this.scoreUrl);
   }

   public getVariant(): Observable<Variant[]> {
      return this.http.get<Variant[]>(this.variantUrl);
   }
}
