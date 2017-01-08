## Aiheenmäärittely

Kuten Pickover, Clifford A:n The Math Book (2009) noteerasi: 

> [it was] the most successful new game of the 1970s. (Pickover, Clifford, 442)

**Aihe:** Kyse on israelilaisen Mordecai Meirowitzin luomasta **Mastermind** nimisestä lautapelistä, jossa yhden pelaajan tulee pyrkiä ratkaisemaan toisen pelaajan rakentama värikoodi. Pähkinänkuoressa se sisältää eri värisiä nappuloita, joista toinen valitsee haluamansa yhdistelmän ja piilottaa tämän yhdistelmän vastapelaajaltaan. Yhdistelmiä on yhteensä 1296. Ratkaisija tekee arvauksen ja laittaa sitä vastaavat pallot omaan riviinsä. Peli etenee niin, että vastaaja kertoo moniko pallo arvaajalla on oikean värinen ja oikealla paikalla (merkitään punaisella) ja moniko pallo on oikean värinen, mutta väärällä paikalla (merkitään valkoisella). Neljä punaista merkkiä tarkoittaa oikeaa vastausta.

Käytännössä tulevaa peliä kuvaavat seuraavat suuntaviivat: 

- [x] Se toteutetaan Javalla
- [x] Käyttäjä tulee arpomaan oikeaa ratkaisua koneelta   

**Käyttäjät:** Opiskelija, Opetushallinto, sekä lähiössä lopeensa arkeensa tylsistynyt individuaali

**Kaikkien käyttäjien toiminnot:** 

	-järjestelmään kirjautuminen
		*onnistuu jos salasana ja käyttäjätunnus oikein 
	-oikean rivin arvaus

**Koneen toiminnot:**

	-kertoo käyttäjälle, menikö rivi oikein





### Tuntikirjanpito
Päivä | Tunnit | Kuvaus
--------------- | ----- | ------
19.12.2016 | 2.5h | Aiheen suunnittelua ja repon luonti
27.12.2016 | 4.5h | Mainin aloittamista ja testien tekoa
31.12.2016 | 5.0h | Toiminnallisuuksien jakamista ja muuta
03.01.2017 | 9.0h | Testien korjausta, metodien muokkausta ja pomin korjausta
04.01.2017 | 3.0h | Javadocien lisäys, raporttien lisäys, luokkakaavion korjaus, GUIn hahmottelua ja aloitusta
06.01.2017 | 4.0h | Testien tekoa, javadocin päivitystä
07.01.2017 | 6.0h | Player ja Number luokat logiikkaan, laajennuksia, testejä
08.01.2017 | 7.0h | Uusia metodeja, sekvenssikaaviot, luokkakaavion päivitys, testejä

### Luokkakaavio 

![Alt text](https://yuml.me/28952192)

### Sekvenssikaaviot

 - Käyttötapaus: Käyttäjä syöttää väärän ja sitten oikean pituisen koodin.  Käyttöliittymä käynnistyy ja tarkistaa Number-luokalta käyttäjän antaman koodin pituutta.  <br/>
Käyttäjän syöttäessä väärän pituisen koodin, palauttaa Number-luokka falsen ja käyttäjälle tulostuu "Wrong Length". Käyttäjän arvatessa uudelleen pituutta Käyttöliittymä varmistaa Number-luokalta pituuden ja tämän ollessa sama, palautuu true. 

![Alt text](SequenceDiagram667.png)

 - Käyttötapaus: Käyttäjä syöttää väärän määrän täysin oikeita (blacks) ja melkein oikeita (whites) ja sen jälkeen syöttää oikean määrän täysin oikeita, voittaen pelin. Käyttöliittymä tarkistaa arvauksen täysin oikeiden ja melkein oikeiden määrät Number-luokalta, joka palauttaa taulukkona määrät ja käyttäjälle tulostuu hänen saamansa täysin oikeiden ja melkein oikeiden arvaustensa määrä. Kun käyttäjä arvaa oikein, Number-luokka palauttaa taulukon ja käyttäjälle tulostuu ilmoitus hänen voitostaan.

![Alt text](SequenceDiagram668.png)

 - Käyttötapaus: Käyttäjä luo nimen peliin. Käyttöliittymä kysyy käyttäjältä "Who are you?" ja käyttäjä syöttää nimensä kenttään. Käyttöliittymä luo uuden Player-olion kyseisellä nimellä Player-luokkaan ja samalla arvausten määrän lukuarvo "guesses" käynnistyy.

![Alt text](SequenceDiagram669.png)

 - Käyttötapaus: Käyttäjä luo haluamansa pituisen koodin. Käyttöliittymä kysyy pituutta käyttäjältä, käyttäjä syöttää kenttään haluamansa koodin pituuden. Käyttöliittymä luo uuden Number-olion Number-luokkaan ja Number-luokan metodit generate() ja shuffle() muodostavat kyseisen pituisen koodin, ja luokka palauttaa sen vastauksena ("answer").

![Alt text](SequenceDiagram670.png)
