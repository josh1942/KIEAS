package kr.or.kpew.kieas.main;

import kr.or.kpew.kieas.common.IssuerProfile;
import kr.or.kpew.kieas.common.Profile;
import kr.or.kpew.kieas.issuer.controller.IssuerManager;
import kr.or.kpew.kieas.network.jms.IssuerTransmitter;


public class IssuerMain
{
	public IssuerMain()
	{
		IssuerProfile profile = new IssuerProfile("issuerkma0124@korea.kr", "기상청");
		Profile gwProfile = new Profile("maingateway", "국민안전처");
		new IssuerManager(new IssuerTransmitter(), profile, gwProfile);		
	}
	
	public static void main(String[] args) 
	{	
		new IssuerMain();
	}	
}
