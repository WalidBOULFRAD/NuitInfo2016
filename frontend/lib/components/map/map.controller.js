import leaflet from 'leaflet';

class MapController {
	constructor() {
		'ngInject';
		this.leaflet = leaflet;

		var mymap = this.leaflet.map('map').setView([45.505, -0.09], 13);

		this.leaflet.tileLayer('https://api.mapbox.com/styles/v1/mapbox/streets-v10/tiles/256/{z}/{x}/{y}?access_token=pk.eyJ1IjoidGJtYiIsImEiOiJjaXc3MHF0cDgwMDAwMnlvNnc2YzVyMnRxIn0.fC7ZJ6ZKBLDlFFNoC1We1w').addTo(mymap);

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
	}

	updateFilters(index) {
		this.filters[index].selected = !this.filters[index].selected;
	}
}

export default MapController;
