package main;

public class MatchBoxClient extends main.abi.Client
{
    public ClientState state;

    public MatchBoxClient(String pIPAdresse, int pPortNr)
    {
        super(pIPAdresse, pPortNr);
        state = ClientState.EMPTY;
    }

    @Override
    public void processMessage(String pMessage)
    {
        switch(state)
        {
            case LIST:
                //JSON aufl�sen
                break;

            default:
                break;
        }
    }

}
