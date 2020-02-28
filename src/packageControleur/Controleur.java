package packageControleur;

import PackageVue.LancementJeux;

public class Controleur {
	
	private LancementJeux frmLancementJeux;
	
	public static void main(String[] args) {
		new Controleur();
			}
	
	public Controleur() {
		
		frmLancementJeux = new LancementJeux(null);
		frmLancementJeux.setVisible(true);
		
		this.frmLancementJeux = new LancementJeux(this);
		Object uneFrame = new Object();
		Object info = new Object();
		
	}
	
		public void evenementsVue(Object uneFrame  , Object info) {
			if (uneFrame instanceof LancementJeux) {
				System.out.println("si uneFrame = LancementJeu");
			}
	}
	
		private void evenementsLancementsJeu(Object info) {
			
		}
	
}
