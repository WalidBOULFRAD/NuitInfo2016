import leaflet from 'leaflet';

class MapController {
	constructor($http, ResourceFixeService) {
		'ngInject';
		this.leaflet = leaflet;
		var self = this;
		this.ResourceFixeService = ResourceFixeService;

		console.log(this.ResourceFixeService.getResource());

	/*	$http.get(
			'http://nominatim.openstreetmap.org/search/Toulouse?format=json&addressdetails=1&limit=1')
			.then(function successCallback(response) {
				var mymap = self.leaflet.map('map').setView([response.data[0].lat, response.data[0].lon], 13);

				self.leaflet.tileLayer('https://api.mapbox.com/styles/v1/mapbox/streets-v10/tiles/256/{z}/{x}/{y}?access_token=pk.eyJ1IjoidGJtYiIsImEiOiJjaXc3MHF0cDgwMDAwMnlvNnc2YzVyMnRxIn0.fC7ZJ6ZKBLDlFFNoC1We1w').addTo(mymap);
			}, function errorCallback(response) {
				return response;
			}); */

	}
}

export default MapController;
