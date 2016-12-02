import DisplayRessourceView from './displayRessource.html';
import DisplayRessourceController from './displayRessource.controller.js';
import './displayRessource.scss';

class DisplayRessource {
	static detailsComponent() {
		return {
			templateUrl: DisplayRessourceView,
			controller: DisplayRessourceController
		};
	}
}

export default DisplayRessource.detailsComponent();
