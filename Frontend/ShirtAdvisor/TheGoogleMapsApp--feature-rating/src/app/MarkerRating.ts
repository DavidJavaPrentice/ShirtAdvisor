import {Marker} from './Marker';
import {User} from './User';

export class MarkerRating {
  public id: number = 0;
  public user: User;
  public marker: Marker;
  public rating: number;
  public review: string;
  // public photo: Object;

  constructor(id: number, user: User, marker: Marker, rating: number, review: string){
    this.id = id;
    this.user = user;
    this.marker = marker;
    this.rating = rating;
    this.review = review;
    // this.photo = photo;
  }
}
