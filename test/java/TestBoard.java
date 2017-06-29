import org.testng.annotations.Test;

import com.qainfotech.tap.training.snl.api.Board;
import com.qainfotech.tap.training.snl.api.BoardModel;
import com.qainfotech.tap.training.snl.api.GameInProgressException;
import com.qainfotech.tap.training.snl.api.MaxPlayersReachedExeption;
import com.qainfotech.tap.training.snl.api.PlayerExistsException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.json.JSONObject;
import org.testng.annotations.BeforeTest;

public class TestBoard {
	Board board;
	BoardModel boardmodel ;
	Object playerObject;
	JSONObject player = (JSONObject)playerObject;
	
	@BeforeTest
	public void load_the_Board() throws FileNotFoundException, UnsupportedEncodingException, IOException 
	{		board = new Board();
	}
  @Test
  public void adding_a_player()	throws IOException, PlayerExistsException, GameInProgressException,
  MaxPlayersReachedExeption 
  {		board.registerPlayer("Arpit");	
        board.registerPlayer("Ruchir");	
        board.getData();
  }
  @Test	public void adding_new_player_should_throw_PlayerExistsException() throws FileNotFoundException,
  UnsupportedEncodingException, PlayerExistsException, GameInProgressException,
  MaxPlayersReachedExeption, IOException 
  {		board.registerPlayer("Ruchir");	
        board.getData();	
  }	
  @Test	
  public void adding_new_player_should_throw_MaxPlayersReachedExeption()  throws FileNotFoundException,
  UnsupportedEncodingException, PlayerExistsException, GameInProgressException, MaxPlayersReachedExeption, IOException
  {		board.registerPlayer("Vishnu");		
        board.registerPlayer("Himanshu");		
        board.getData();
        }	
  
}
