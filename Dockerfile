FROM skammer/clojurescript-builder:latest

WORKDIR /usr/src/app

COPY ./ /usr/src/app

# Install deps
RUN npm install
RUN lein deps

# Build the project
RUN lein prod

# Remove extra files and directories
RUN rm README.md karma.conf.js package-lock.json project.clj shadow-cljs.edn
RUN rm -rf ./dev ./lsp ./src ./target ./test

EXPOSE 8080

CMD ["npm", "run", "start"]