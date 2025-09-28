# 🤖 Discord AI Assistant Bot

*Transform your Discord server into your personal AI-powered workspace!*

## 🌟 What's This About?

Ever wished you had a smart assistant right in your Discord server? Well, now you do! This bot brings the power of Google's Gemini AI directly to your Discord channels. Ask questions, get help with coding, brainstorm ideas, or just have a philosophical chat with your AI buddy.

## ✨ Features

- 🧠 **Smart AI Responses** - Powered by Google Gemini for intelligent conversations
- ⚡ **Slash Commands** - Modern Discord integration with `/ask` command
- 🔒 **Secure** - API keys safely managed with environment variables
- 🚀 **Fast & Reliable** - Built with Java and JDA for optimal performance
- 💬 **Natural Conversations** - Ask anything and get helpful, contextual responses

## 🎯 Perfect For

- **Developers** - Get coding help, debug issues, explain concepts
- **Students** - Homework assistance, research questions, learning support
- **Teams** - Brainstorming sessions, quick fact-checking, problem-solving
- **Anyone** - General questions, creative writing, casual conversations

## 🛠️ Tech Stack

- **Java 17** - Because we like our coffee strong ☕
- **JDA (Java Discord API)** - The backbone of Discord bot magic
- **Google Gemini API** - The brain of the operation
- **Maven** - For dependency management
- **dotenv** - Keeping secrets secret 🤫

## 🚀 Quick Start

### Prerequisites
- Java 17 or higher
- A Discord Bot Token ([Get one here](https://discord.com/developers/applications))
- A Google Gemini API Key ([Get one here](https://ai.google.dev/))
- Maven (for building the project)

### Setup Steps

1. **Clone this repository**
   ```bash
   git clone https://github.com/yourusername/discord-ai-bot
   cd discord-ai-bot
   ```

2. **Create your environment file**
   ```bash
   # Create a .env file in the project root
   TOKEN=your_discord_bot_token_here
   GEMINI_API_KEY=your_gemini_api_key_here
   ```

3. **Build and run**
   ```bash
   mvn clean compile exec:java
   ```

4. **Invite your bot to Discord**
    - Go to Discord Developer Portal
    - Generate an invite link with bot permissions
    - Add to your server

5. **Start chatting!**
   ```
   /ask question:What is the meaning of life?
   /ask question:How do I center a div in CSS?
   /ask question:Write me a haiku about coding
   ```

## 📖 Usage Examples

```
🧑 /ask question:Explain quantum physics in simple terms
🤖 Quantum physics is like nature's magic trick! Imagine particles that can be in multiple places...

🧑 /ask question:Debug this Java code: System.out.println("Hello World")
🤖 Your code looks perfect! It will print "Hello World" to the console...

🧑 /ask question:What's the weather like on Mars?
🤖 Mars has quite extreme weather! Temperatures can range from...
```

## 🎨 Customization

Want to make it your own? Here are some ideas:

- **Change the AI model** - Switch from `gemini-1.5-flash` to `gemini-2.5-pro` for more powerful responses
- **Add more commands** - Extend functionality with project management features
- **Custom personality** - Modify prompts to give your bot a unique personality
- **Enhanced responses** - Add embed messages, reactions, or rich formatting

## 🤝 Contributing

Found a bug? Have a cool idea? Contributions are welcome!

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 🐛 Troubleshooting

**Bot not responding?**
- Check your API keys in the `.env` file
- Ensure bot has proper permissions in your Discord server
- Look at console output for error messages

**Getting rate limited?**
- Gemini has usage limits on free tier
- Consider upgrading your API plan for heavy usage

**Long responses getting cut off?**
- Discord has a 2000 character limit per message
- The bot automatically truncates long responses

## 🙏 Acknowledgments

- **Google** for the amazing Gemini API
- **JDA Community** for the excellent Discord library
- **Coffee** for keeping the developer awake during late-night coding sessions

---

**Made with ❤️ and lots of caffeine**

*If this bot helped you, consider giving it a ⭐ on GitHub!*

## 🔮 Future Plans

- 🎯 Project management features
- 📊 Usage analytics
- 🎨 Custom embed responses
- 🌍 Multi-language support
- 🤖 Multiple AI model support

---

*Happy coding! 🚀*