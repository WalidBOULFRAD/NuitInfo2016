import leaflet from 'leaflet';

class MapController {
	constructor() {
		'ngInject';
		this.leaflet = leaflet;

		var mymap = this.leaflet.map('map').setView([51.505, -0.09], 13);

		this.leaflet.tileLayer('https://api.mapbox.com/styles/v1/mapbox/streets-v10/tiles/256/{z}/{x}/{y}?access_token=pk.eyJ1IjoidGJtYiIsImEiOiJjaXc3MHF0cDgwMDAwMnlvNnc2YzVyMnRxIn0.fC7ZJ6ZKBLDlFFNoC1We1w').addTo(mymap);
	}
}

export default MapController;
