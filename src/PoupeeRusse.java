
public class PoupeeRusse {
	private int taille;
	private boolean fermer;
	private PoupeeRusse pContenue,pContenant;
	public PoupeeRusse(int taille) {
		this.pContenant=null;
		this.pContenant=null;
		this.taille=taille;
		this.fermer=true;
	}
	public void ouvrir() {
		if(this.fermer && this.pContenant==null) {
			this.fermer=false;
		}
	}
	public void fermer() {
		if(!this.fermer && this.pContenue==null) {
			this.fermer=true;
		}
	}
	public void placerDans(PoupeeRusse p) {
		if(this.fermer==true && pContenant==null && !p.fermer && p.pContenue==null && p.taille>this.taille) {
			this.pContenant=p;
				p.pContenue=(this);
		}
	}
	public void sortirDe(PoupeeRusse p) {
		if(this.pContenant==p && !p.fermer) {
			this.pContenant=null;
			p.pContenue=null;
		}
	}
}
