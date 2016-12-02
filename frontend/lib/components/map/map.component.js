import MapView from './map.html';
import './map.scss';
import MapController from './map.controller.js';

class Map {
	static detailsComponent() {
		return {
			templateUrl: MapView,
			controller: MapController
		};
	}
}

export default Map.detailsComponent();
