import { Score } from './../model/score';
import { Variant } from './../model/variant';
import { ReportService } from './../service/report-service.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student-report',
  templateUrl: './student-report.component.html',
  styleUrls: ['./student-report.component.css']
})
export class ReportComponent implements OnInit {
  scores: Score[] = [];
  variants: Variant[] = [];

  constructor(private reportService: ReportService) {}

  ngOnInit(): void {
    this.reportService.getScore().subscribe(data => {
      this.scores = data;
    });

    this.reportService.getVariant().subscribe(data => {
      this.variants = data;
    });
  }

  getClass(score: number) {
    var filteredVariant = this.variants.filter((variant) => (score >= variant.minScore && score <= variant.maxScore));
    var variant = <Variant> filteredVariant[0];
    return variant.css;
  }

  getClassForResult(result: string) {
    if(result === 'Pass') {
      return "table-primary"
    }else {
      return "table-danger";
    }
  }
}
