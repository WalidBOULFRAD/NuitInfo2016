import poiView from './poi.html';
import './poi.scss';

class poi {
	static detailsComponent() {
		return {
			templateUrl: poiView
		};
	}
}

export default poi.detailsComponent();
