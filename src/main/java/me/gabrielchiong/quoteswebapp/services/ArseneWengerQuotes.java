package me.gabrielchiong.quoteswebapp.services;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ArseneWengerQuotes {
    private List<String> quotes;

    public ArseneWengerQuotes() {
        quotes = Arrays.asList(
                "I cannot classify the moments of happiness and of sadness, but every defeat is a scar in your heart that you never forget.",
                "I don’t look at the passport of people; I look at their quality and their attitude.",
                "We do not buy superstars. We make them.",
                "Football is an art, like dancing is an art – but only when it’s well done does it become an art.",
                "A manager is a guide. He takes a group of people and says, ‘With you I can make us a success; I can show you the way.",
                "Religiously, it is said that God created man. I am only a guide. I allow others to express what they have in them. I have not created anything. I am a facilitator of what is beautiful in man.",
                "I think in England you eat too much sugar and meat and not enough vegetables.",
                "I am not scared to spend money. If you go out with me one night, you will understand that.",
                "The real revelation of a player’s character is not in his social life but in how he plays. In my social life I can hide my real personality.",
                "When you give success to stupid people, it makes them more stupid sometimes and not more intelligent.",
                "One of the things I discovered in Japan was from watching sumo wrestling. At the end you can never tell who has won the fight, and who has lost, because they do not show their emotion because it could embarrass the loser. It is unbelievable. That is why I try to teach my team politeness. It is only here in England that everybody pokes their tongue out when they win.",
                "I’m not a witch doctor; I’m just a football coach.",
                "Don’t be scared to be ambitious. It’s not a humiliation to have a high target and to fail. For me, the real humiliation is to have a target and not to give everything to reach it.",
                "I believe [team spirit] is a little bit like a flower. You have to take care of it and look after it every day, or else it will slowly die. But as well, you can make the flower bigger, better and prettier if you care for it.",
                "A football team is like a beautiful woman, when you do not tell her, she forgets she is beautiful.",
                "If you eat caviar every day it’s difficult to return to sausages.",
                "[Winning] It’s like a child who is used to having ice cream whenever he wants. When it doesn’t come when he asks, he tends to get confused and nervous.",
                "What is unbelievable is that I am in a position where people reproach me for making a profit. The people who lose money – nobody says a word.",
                "English players are easy to coach. The problem is that the Premier League has the best players in the world, and statistically not all of them can be born in England. But we don’t have enough English players: we are working very hard on it.",
                "The biggest things in life have been achieved by people who, at the start, we would have judged crazy. And yet if they had not had these crazy ideas the world would have been more stupid.",
                "It’s silly to work hard the whole week and then spoil it by not preparing properly before the game.",
                "I don’t want the will to educate to be opposed by the will to win. That makes the educator sound like an idiot. Any manager’s approach must be to educate. One of the beauties of our job is the power to influence the course of a man’s life in a positive way. You and me have been lucky enough to meet people who believed in us and led us forward. The streets are full of talented people but who didn’t have the luck of finding someone who placed their faith in them. I can be the one that facilitates life, that give an opportunity.",
                "When you look at people who are successful, you will find that they aren’t the people who are motivated, but have consistency in their motivation.",
                "In my job the main quality is to be an optimist. If you see the future in a negative way you commit suicide in my job. You have to pick up everybody inside the club. You should see what the club is like after a big defeat, it’s like a lost war and everybody is on the floor. You have to be an optimist to say, “Come on my friends, we are good enough to pick up and win our next game. We can do this together. Remember how good you are.” Everybody forgets quickly in life how good he is and how good he can be when things go wrong. I believe my job is to be an optimist.",
                "If you have a child who is a good musician, what is your first reaction? It is to put them into a good music school, not in an average one. So why should that not happen in football?",
                "You are responsible for the motivation of all the people around you.",
                "We live a society where everybody knows everything and it looks like it is a shame to say I don’t know.",
                "To remain unbeaten in a championship like the English championship now is really unbelievable. I want to win the Champions’ League but, really, this is more important. It is something amazing, something special.",
                "They [Chelsea] are a financially doped club. They have enhancement of performances through financial resources which are unlimited. It puts pressure on the market that is not very healthy.",
                "The only moment of possible happiness is the present. The past gives regrets. And future uncertainties.",
                "Young players need freedom of expression to develop as creative players. They should be encouraged to try skills without fear of failure.",
                "My job is to give people who work hard all week something to enjoy on Saturdays and Wednesdays.",
                "I believe the target of anything in life should be to do it so well that it becomes an art. When you read some books they are fantastic, the writer touches something in you that you know you would not have brought out of yourself. He makes you discover something interesting in your life. If you are living like an animal, what is the point of living? What makes daily life interesting is that we try to transform it into something that is close to art. And football is like that. When I watch Barcelona, it is art.",
                "At some clubs success is accidental. At Arsenal, it is compulsory."
        );
    }

    public String getRandomQuote() {
        return quotes.get(ThreadLocalRandom.current().nextInt(0, quotes.size()));
    }
}
