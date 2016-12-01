import DisplayRessourceView from './displayRessource.html';
import './displayRessource.scss';

class DisplayRessource {
	static detailsComponent() {
		return {
			templateUrl: DisplayRessourceView
		};
	}
}

export default DisplayRessource.detailsComponent();
