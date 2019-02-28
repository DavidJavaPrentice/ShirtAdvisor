import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {MarkerRatingService} from '../marker-rating.service';
import {MarkerRating} from '../MarkerRating';
import {LocalStorageService} from '../LocalStorageService';
import {MarkerService} from '../marker.service';
import {User} from '../User';
import {LocationService} from '../location-service.service';

@Component({
  selector: 'app-marker-rating',
  templateUrl: './marker-rating.component.html',
  styleUrls: ['./marker-rating.component.css']
})
export class MarkerRatingComponent implements OnInit {

  @Input() rating: number;
  @Output() ratingClick: EventEmitter<any> = new EventEmitter<any>();
  review: string;
  model: MarkerRating = new MarkerRating(0, this.storage.getStoredUser(), null, this.rating, '');
  submitted = false;
  invalid = false;

  constructor(private markerService: MarkerService, private locationService: LocationService, private markerRatingService: MarkerRatingService, private storage: LocalStorageService) { }

  submit() {
    this.submitted = true;
    this.invalid = false;
  }
  // saveMarkerRating(model){
  //   console.log(model);
  //   this.model.review = model.review;
  //   // this.model.rating = rating;
  //   // this.model.photo = photo;
  //   // this.model.User = this.storage.getStoredUser();
  //   console.log(this.model.user);
  //   this.model.marker = this.storage.getStoredMarker();
  //   console.log(this.model.marker);
  //   console.log(this.model);
  //   if (this.model.user.id > 0 && this.model.marker.id > 0){
  //     console.log(this.model);
  //     this.markerRatingService.saveMarkerRating(this.model).subscribe();
  //     this.submit();
  //   }else{
  //         this.invalid = true;
  //       }
  // }

  // saveMarkerRating(m){
  //   this.model.review = m.review;
  //   // this.model.rating = rating;
  //   // this.model.photo = photo;
  //   this.model.user = this.storage.getStoredUser();
  //   console.log(this.model.user);
  //   this.model.marker = m;
  //   if (this.model.user.id > 0 && m.id > 0){
  //     console.log(this.model.rating);
  //     this.markerRatingService.saveMarkerRating(this.model).subscribe();
  //     this.submit();
  //   }else{
  //     this.invalid = true;
  //   }
  // }




  ngOnInit(): void {
  }

}
