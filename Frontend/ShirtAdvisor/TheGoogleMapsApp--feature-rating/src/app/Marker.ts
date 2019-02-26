export class Marker {
  public id: number;
  public address: Object;
  public lat: number;
  public lng: number;
  public draggable: boolean;

  constructor(id: number, address: Object, lat: number, lng: number, draggable: boolean) {
    this.id = id;
    this.address =address;
    this.lat = lat;
    this.lng = lng;
    this.draggable = draggable;
  }
}
