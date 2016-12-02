import poiView from './poi.html';
import './poi.scss';
import poiController from './poi.controller.js';

class poi {
	static detailsComponent() {
		return {
			templateUrl: poiView,
			controller: poiController
		};
	}
}

export default poi.detailsComponent();
