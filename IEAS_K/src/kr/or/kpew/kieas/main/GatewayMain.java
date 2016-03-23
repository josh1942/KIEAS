package kr.or.kpew.kieas.main;

import kr.or.kpew.kieas.common.Profile;
import kr.or.kpew.kieas.gateway.controller.GatewayManager;
import kr.or.kpew.kieas.network.jms.GatewayTransmitter;


public class GatewayMain
{
	public GatewayMain()
	{
		//GatewayModel.getInstance();
	}
	
	public static void main(String[] args)
	{
		new GatewayManager(new GatewayTransmitter(),
				new Profile("maingateway@korea.kr", "국민안전처"));
	}
}
