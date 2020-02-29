FROM skammer/clojurescript-builder:latest

WORKDIR /usr/src/app

COPY ./ /usr/src/app

# Install deps
RUN npm install
RUN lein deps

# Build the project
RUN lein prod

# Remove extra files and directories
RUN rm Dockerfile README.md karma.conf.js package-lock.json project.clj shadow-cljs.edn
RUN rm -rf dev lsp src target test

# Remove all extra node_modules
#RUN mv node_modules/serve serve && \
#    mv node_modules/.bin .bin && \
#    rm -rf node_modules && \
#    mkdir node_modules && \
#    mv serve node_modules/serve && \
#    mv .bin node_modules/.bin

# Exposure of the port is not supported by Heroku. Use it for the local testing via:
# docker run -p 3000:3000 <container-name>
#EXPOSE 3000

CMD ["npm", "run", "serve"]