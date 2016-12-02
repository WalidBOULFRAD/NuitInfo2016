import leaflet from 'leaflet';

class MapController {

	constructor($http, ResourceFixeService) {
		'ngInject';
		this.leaflet = leaflet;
		var self = this;

		this.filters = [
			{
				icon: 'id-card-o',
				selected: false,
				type: 'Administration',
				name: 'administration'
			},
			{
				icon: 'cutlery',
				selected: false,
				type: 'Alimentaire',
				name: 'food'
			},
			{
				icon: 'bed',
				selected: false,
				type: 'Hebergement',
				name: 'housing'
			},
			{
				icon: 'medkit',
				selected: false,
				type: 'Medical',
				name: 'health'
			},
			{
				icon: 'bath',
				selected: false,
				type: 'Sanitaire',
				name: 'hygiene'
			},
			{
				icon: 'at',
				selected: false,
				type: 'Hotspot',
				name: 'wifi'
			}
		];

		// var greenIcon = this.leaflet.icon({
	  //   iconUrl: 'pin.png'
		// });

		this.ResourceFixeService = ResourceFixeService;
		this.ResourceFixeService.getResource().then(function (res) {
			console.log(res);
		});

		$http.get('http://nominatim.openstreetmap.org/search/Toulouse?format=json&addressdetails=1&limit=1')
		.then(function (response) {
			console.log(response);
			var mymap = self.leaflet.map('map').setView([response.data[0].lat, response.data[0].lon], 13);

			self.leaflet.tileLayer('https://api.mapbox.com/styles/v1/mapbox/streets-v10/tiles/256/{z}/{x}/{y}?access_token=pk.eyJ1IjoidGJtYiIsImEiOiJjaXc3MHF0cDgwMDAwMnlvNnc2YzVyMnRxIn0.fC7ZJ6ZKBLDlFFNoC1We1w').addTo(mymap);
		}, function (response) {
			return response;
		});
	}

	updateFilters(index) {
		this.filters[index].selected = !this.filters[index].selected;
	}
}

export default MapController;
