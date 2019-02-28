import { Component, OnInit } from '@angular/core';
import {MarkerRatingService} from '../marker-rating.service';
import {MarkerRating} from '../MarkerRating';
import {marker} from '../app.component';

@Component({
  selector: 'app-review-list',
  templateUrl: './review-list.component.html',
  styleUrls: ['./review-list.component.css'],
  providers: [MarkerRatingService]
})
export class ReviewListComponent implements OnInit {

  markerRatings: MarkerRating[];
  AvgRating: number;

  constructor(private markerRatingService: MarkerRatingService) { }

  ngOnInit() {

    this.getAllReviews();
  }

  getAllReviews() {
    this.markerRatingService.findAll().subscribe(
      markerRatings => {
        this.markerRatings = markerRatings;

      },
      err => {
        console.log(err);
      }
    );
  }


}
