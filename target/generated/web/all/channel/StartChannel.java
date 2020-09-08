package web.all.channel;

//---------------------------------------------------------------------------------------
//	    _  _____ ____     ____                           _             
//	   / \|_   _/ ___|   / ___| ___ _ __   ___ _ __ __ _| |_ ___  _ __ 
//	  / _ \ | | \___ \  | |  _ / _ \ '_ \ / _ \ '__/ _` | __/ _ \| '__|
//	 / ___ \| |  ___) | | |_| |  __/ | | |  __/ | | (_| | || (_) | |   
//	/_/   \_\_| |____/   \____|\___|_| |_|\___|_|  \__,_|\__\___/|_|   
//
//---------------------------------------------------------------------------------------
//	/!\ Warning /!\
//	This class has been automatically generated by ATS Script Generator (ver. 1.7.8)
//	You may loose modifications if you edit this file manually !
//---------------------------------------------------------------------------------------

import org.testng.annotations.Test;
import com.ats.script.*;
import com.ats.script.actions.*;
import com.ats.script.actions.neoload.*;
import com.ats.script.actions.performance.*;
import com.ats.script.actions.performance.octoperf.*;
import com.ats.executor.ActionTestScript;
import com.ats.generator.objects.Cartesian;
import com.ats.generator.objects.mouse.Mouse;
import com.ats.generator.variables.Variable;
import com.ats.generator.variables.ConditionalValue;
import com.ats.tools.Operators;

public class StartChannel extends ActionTestScript{

	/**
	* Test Name : <b>web.all.channel.StartChannel</b>
	* Generated at : <b>8 sept. 2020 à 17:17:57</b>
	*/

	public StartChannel(){super();}
	public StartChannel(com.ats.executor.ActionTestScript sc){super(sc);}

	@Override
	public final String gav(){return "com.functional.technical(0.0.1)";}

	@Override
	protected ScriptHeader getHeader(){
		return new ScriptHeader(
			"",
			"LAPTOP-LT8QHS42\\Agilitest",
			"",
			"",
			"");
	}

	@Test
	public void testMain(){

		//   ---< Variables >---   //


		//   ---< Actions >---   //

		exec(0,new ActionChannelStart(this, "startChannel", clv(prm(0, "chrome")), new String[]{}));
		exec(1,new ActionChannelClose(this, "startChannel", false));
	}
}