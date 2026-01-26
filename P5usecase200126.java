package first;
//USE CASE (5) 20/01/26
public class P5usecase200126 {
	private String VotingRights;
	private String Identity;
	
	public void setVotingRights(String votingrights) {
		this.VotingRights=votingrights;
	}
	public void setIdentity(String Identity) {
		this.Identity=Identity;
	}
	
	public String getVotingRights() {
		return VotingRights;
	}
	public String getIdentity() {
		return Identity;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P5usecase200126 p = new P5usecase200126();
		p.setVotingRights("Eligible");
		p.setIdentity("Yuvi");
		System.out.println("Voting Rights: "+ p.getVotingRights());
		System.out.println("Identity: "+ p.getIdentity());
		

	}

}
